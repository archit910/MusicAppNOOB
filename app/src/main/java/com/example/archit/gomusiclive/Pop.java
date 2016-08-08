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

import java.util.ArrayList;

public class Pop extends AppCompatActivity {

    class viewholder
    {
        TextView Name;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);
        ArrayList<String > myList = new ArrayList<>();
        myList.add("Michael Jackson  ");
        myList.add("Jennifer Lopez   ");
        myList.add("Maroon 5       ");
        ListView listView = (ListView) findViewById(R.id.list_viewP);
        adapter ad = new adapter(myList);
        listView.setAdapter(ad);
        final Fragment_Lopez fragment_lopez = new Fragment_Lopez();
        final Fragment_Jackson fragment_jackson = new Fragment_Jackson();
        final mfive m_five = new mfive();
        final FragmentManager fMgr = getSupportFragmentManager();
        FragmentTransaction fTxn = fMgr.beginTransaction();
        fTxn.add(R.id.frame_containerPop,fragment_lopez,null);
        fTxn.commit();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                viewholder vh = (viewholder)view.getTag();
                String cString = (vh.Name.getText()).toString();
                if(cString.equals("Michael Jackson  "))
                {
                    FragmentTransaction fTxn = fMgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerPop,fragment_jackson,null);
                    fTxn.commit();


                }

                if(cString.equals("Jennifer Lopez   "))
                {
                    FragmentTransaction fTxn = fMgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerPop,fragment_lopez,null);
                    fTxn.commit();


                }
                if(cString.equals("Maroon 5       "))
                {
                    FragmentTransaction fTxn = fMgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerPop,m_five,null);
                    fTxn.commit();


                }

            }
        });
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
    public void getLiveLopez(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=JenniferLOpez");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public  void getMusicLopez(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/user/Maroon5");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getWikiLopez(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Arijit_Singh");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getLivemj(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=MJLive");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public  void getMusicmj(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/user/michaeljackson");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getWikimj(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Arijit_Singh");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }public void getLivem5(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=maroon+5+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public  void getMusicm5(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/user/Maroon5");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getWikim5(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Maroon_5");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }

}
