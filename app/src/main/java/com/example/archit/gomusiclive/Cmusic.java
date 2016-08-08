package com.example.archit.gomusiclive;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Cmusic extends AppCompatActivity {
    class viewholder
    {
        TextView name;
    }
    int logic=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmusic);
        ArrayList<String> mylist =new ArrayList<>();
        mylist=addall();
        adapter ad= new adapter(mylist);
        ListView lv = (ListView) findViewById(R.id.list_viewc);
        lv.setAdapter(ad);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                viewholder vh = (viewholder)view.getTag();
                String Name = vh.name.getText().toString();
                vh.name.setTextColor(Color.BLUE);

                switch (Name)
                {
                    case "BollyWood":
                       openBolly();
                        break;
                    case "Rock!":
                       openRock();
                        break;
                    case "Pop":
                        openPop();
                        break;
                    case "Classical":
                       openClassical();
                        break;
                    case "New Songs":
                        openNewSongs();
                        break;
                    case "Download Links":
                        openDownload();
                        break;


                }


            }
        });
    }
    void openBolly()
    {
        Intent i =  new Intent();
        i.setClass(getApplicationContext(),Bolly.class);
        startActivity(i);
    }
    void openRock()
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Rock.class);
        startActivity(i);
    }
    void openPop()
    {
        Intent i = new Intent();
        i.setClass(getApplicationContext(),Pop.class);
        startActivity(i);
    }
    void openClassical()
    {
//        Intent i - new Intent();
//        i.setClass(getApplicationContext(),Classical.class);
//        startActivity(i);
    }
    void openDownload()
    {
        //        Intent i - new Intent();
//        i.setClass(getApplicationContext(),Download.class);
//        startActivity(i);

    }
    void openNewSongs()
    {
        //        Intent i - new Intent();
//        i.setClass(getApplicationContext(),Classical.class);
//        startActivity(i);
    }


    public ArrayList<String> addall()
    {
        ArrayList<String> mylist =new ArrayList<>();
        mylist.add("BollyWood");
        mylist.add("Rock!");
        mylist.add("Pop");
        mylist.add("Classical");
      //  mylist.add("New Songs");
        mylist.add("Download Links");
        return mylist;
    }
    public class adapter extends BaseAdapter
    {
        ArrayList<String> mylist =new ArrayList<>();
        public adapter(ArrayList<String> mylist)
        {
            this.mylist = mylist;

        }

        @Override
        public int getCount() {
            return mylist.size();
        }

        @Override
        public String getItem(int i) {
            return mylist.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater li= getLayoutInflater();
            viewholder  vh;
            if(view == null)
            {
                view = li.inflate(R.layout.list_layout1,null);
                vh = new viewholder();

                vh.name = (TextView)view.findViewById(R.id.textView12);
                view.setTag(vh);
            }
            else
            vh = (viewholder) view.getTag();
            String change = getItem(i);
            vh.name.setText(change);
            Log.d("TAg 2",change);

                vh.name.setTextColor(Color.MAGENTA);


            return view;
        }
    }

}

