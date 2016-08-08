package com.example.archit.gomusiclive;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Rock extends AppCompatActivity {

    class viewholder{
        TextView Name;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);
        ArrayList<String> myList = new ArrayList<>();
        myList = getAll();
        ListView listView = (ListView) findViewById(R.id.list_viewR);
        adapter ad = new adapter(myList);
        listView.setAdapter(ad);
        final Fragment_Greenday fragment_greenday = new Fragment_Greenday();
        final Fragment_Linkin fragment_linkin = new Fragment_Linkin();
        final Fragment_Metal fragment_metal = new Fragment_Metal();
        final Fragment_three fragment_three = new Fragment_three();
        final FragmentManager fmgr=getSupportFragmentManager();
        FragmentTransaction fTxn = fmgr.beginTransaction();
        fTxn.add(R.id.frame_containerRock,fragment_greenday,null);
        fTxn.commit();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                viewholder vh = (viewholder)view.getTag();
                String cString = (vh.Name.getText()).toString();
                if(cString.equals("Green Day   "))
                {
                    FragmentTransaction fTxn = fmgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerRock,fragment_greenday,null);
                    fTxn.commit();


                }
                if(cString.equals("Mettalica    "))
                {
                    FragmentTransaction fTxn = fmgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerRock,fragment_metal,null);
                    fTxn.commit();


                }
                if(cString.equals("LinkinPark   "))
                {
                    FragmentTransaction fTxn = fmgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerRock,fragment_linkin,null);
                    fTxn.commit();


                }
                if(cString.equals("3 Doors Down"))
                {
                    FragmentTransaction fTxn = fmgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerRock,fragment_three,null);
                    fTxn.commit();


                }

            }
        });

    }
    ArrayList<String> getAll()
    {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Green Day   ");
        myList.add("Mettalica    ");
        myList.add("LinkinPark   ");
        myList.add("3 Doors Down");
        return myList;
    }
    public class adapter extends BaseAdapter
    {
        ArrayList<String> myList = new ArrayList<>();

        public adapter(ArrayList<String> myList) {
            this.myList = myList;
        }



        @Override
        public int getCount() {
            return myList.size();
        }

        @Override
        public String getItem(int i) {
            return myList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }
        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            viewholder vh;
            LayoutInflater li = getLayoutInflater();
            if(view  == null)
            {
                view = li.inflate(R.layout.bolly_layout,null);
                vh = new viewholder();
                vh.Name = (TextView)view.findViewById(R.id.bolly_text);
                view.setTag(vh);


            }
            else
            vh = (viewholder) view.getTag();
            String thisString = getItem(i);
            vh.Name.setText(thisString);
            return view;
        }
    }
    public void getLiveLi(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=linkin+park+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getMusicLi(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/user/linkinparktv");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getWikiLi(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Linkin_Park");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getLiveme(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=mettalica+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getMusicme(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/user/MetallicaTVOfficial");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getWikime(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Metallica");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }public void getLive3(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=three+doorsdown+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getMusic3(View view)
    { Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/3_Doors_Down");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getWiki3(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=eTj7LcBNDAw");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }public void getLivegd(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=Green+day+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }
    public void getMusicgd(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/user/greenday");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }
    public void getWikigd(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Green_Day");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }

}
