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
import android.widget.Toast;

import java.util.ArrayList;

public class Bolly extends AppCompatActivity {

    class viewholder
    {
        TextView Name;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolly);
        ArrayList<String> mylist = new ArrayList<>();
        mylist= getList();
        ListView listView = (ListView) findViewById(R.id.list_view2);
        adapter ad = new adapter(mylist);
        listView.setAdapter(ad);
        final Fragment_Sonu fragment_sonu = new Fragment_Sonu();
        final Fragment_ankit fragment_ankit = new Fragment_ankit();
        final Fragment_kk fragment_kk = new Fragment_kk();
       final  Fragment_Arijit fragment_arijit = new Fragment_Arijit();
        final FragmentManager fMgr = getSupportFragmentManager();
        FragmentTransaction fTxn = fMgr.beginTransaction();
        fTxn.add(R.id.frame_containerBolly, fragment_arijit,null);
        fTxn.commit();
       // Toast.makeText(Bolly.this, "Done", Toast.LENGTH_SHORT).show();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                viewholder vh=(viewholder) view.getTag();
                String cString = (vh.Name.getText()).toString();
                if(cString.equals("Sonu Nigam")){
                    FragmentTransaction fTxn = fMgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerBolly, fragment_sonu ,null);
                    fTxn.commit();
                }
                if(cString.equals("Arijit Singh ")){
                    FragmentTransaction fTxn = fMgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerBolly,fragment_arijit ,null);
                    fTxn.commit();
                }
                if(cString.equals("Ankit Tiwari")){
                    FragmentTransaction fTxn = fMgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerBolly,fragment_ankit ,null);
                    fTxn.commit();
                }
                if(cString.equals("KK                         ")){
                    FragmentTransaction fTxn = fMgr.beginTransaction();
                    fTxn.replace(R.id.frame_containerBolly,fragment_kk ,null);
                    fTxn.commit();
                }


            }
        });
    }
    ArrayList<String > getList()
    {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Arijit Singh ");
        myList.add("Sonu Nigam");
        myList.add("Ankit Tiwari");
        myList.add("KK                         ");
        myList.add("Akshay Tyagi");
        return myList;

    }
    public class adapter extends BaseAdapter
    {
        ArrayList<String > myList = new ArrayList<>();
        public adapter ( ArrayList< String > myList){
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
            if( view == null)
            {
                view  = li.inflate(R.layout.bolly_layout,null);
                vh = new viewholder();
                vh.Name =(TextView) view.findViewById(R.id.bolly_text);
                view.setTag(vh);
            }
            else
                vh = (viewholder) view.getTag();
            String Setting  = getItem(i);
            vh.Name.setText(Setting);
            return view;
        }
    }
    public void getLiveArijit(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=arijit+singh+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public  void getMusicArijit(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/user/Arijithindisong");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getWikiArijit(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Arijit_Singh");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }

    public void getLiveSonu(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=sonu+nigam+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public  void getMusicSonu(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=eTj7LcBNDAw");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getWikiSonu(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Sonu_Nigam");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public void getLiveAnkit(View view)
    { Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=ankit+tiwari+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);

    }
    public  void getMusicAnkit(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=mzg6eeWzKjQ");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }
    public void getWikiAnkit(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/Ankit_Tiwari");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }
    public void getLivekk(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://www.youtube.com/results?search_query=kk+live");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }
    public  void getMusickk(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("http://www.jukebo.com/kk/all-the-music-videos-kk.html");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }
    public void getWikikk(View view)
    {
        Intent i = new Intent();
        Uri uri = Uri.parse("https://en.wikipedia.org/wiki/KK_(singer)");
        i.setAction(Intent.ACTION_VIEW);
        i.setData(uri);
        startActivity(i);
    }



}
