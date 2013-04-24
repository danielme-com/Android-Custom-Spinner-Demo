package com.danielme.android.spinnerdemo;

import java.util.ArrayList;
import java.util.List;

import com.danieme.android.spinnerdemo.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * 
 * @author danielme.com
 *
 */
public class MainActivity extends Activity
{
	
	private Spinner spinner;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);	
		
		//datos a mostrar
		List<SocialNetwork> items = new ArrayList<SocialNetwork>();
		items.add(new SocialNetwork(getString(R.string.none), R.drawable.none));
		items.add(new SocialNetwork(getString(R.string.blogger), R.drawable.blogger));
		items.add(new SocialNetwork(getString(R.string.delicious), R.drawable.delicious));
		items.add(new SocialNetwork(getString(R.string.digg), R.drawable.digg));
		items.add(new SocialNetwork(getString(R.string.ebay), R.drawable.ebay));
		items.add(new SocialNetwork(getString(R.string.facebook), R.drawable.facebook));
		items.add(new SocialNetwork(getString(R.string.flickr), R.drawable.flickr));
		items.add(new SocialNetwork(getString(R.string.google), R.drawable.google));
		items.add(new SocialNetwork(getString(R.string.lastfm), R.drawable.lastfm));
		items.add(new SocialNetwork(getString(R.string.reddit), R.drawable.reddit));
		items.add(new SocialNetwork(getString(R.string.stumbleupon), R.drawable.stumbleupon));
		items.add(new SocialNetwork(getString(R.string.technorati), R.drawable.technorati));
		items.add(new SocialNetwork(getString(R.string.twitter), R.drawable.twitter));
		items.add(new SocialNetwork(getString(R.string.wordpress), R.drawable.wordpress));
		items.add(new SocialNetwork(getString(R.string.youtube), R.drawable.youtube));

		spinner = (Spinner) findViewById(R.id.spinner);
		spinner.setAdapter(new SocialNetworkSpinnerAdapter(this,items));
		spinner.setOnItemSelectedListener(new OnItemSelectedListener() 
		{
			@Override
			public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id)
			{
  			  Toast.makeText(adapterView.getContext(), ((SocialNetwork) adapterView.getItemAtPosition(position)).getName(), Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onNothingSelected(AdapterView<?> adapterView)
			{
				//nothing				
			}
		});

	}
}