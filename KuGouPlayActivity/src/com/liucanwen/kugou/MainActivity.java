package com.liucanwen.kugou;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity
{
	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_home);
		
		initializeViews();
		
		initializeListeners();
	}
	
	private void initializeViews()
	{
		listView = (ListView) findViewById(R.id.listview);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, getData());
		
		listView.setAdapter(adapter);
	}
	
	private void initializeListeners()
	{
		listView.setOnItemClickListener(new OnItemClickListener()
		{
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3)
			{
				Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
				startActivity(intent);
			}
		});
	}
	
	private String[] getData()
	{
		String[] arr = new String[]{"����-��Ҷ��", "��ޥ-Լ��", "�Ž�-������", "����-����", "ֻԸ��һ����", "������-�°���˿", "ƬƬ��Ҷ��", "������-��ĭ"};
		
		return arr;
	}
}
