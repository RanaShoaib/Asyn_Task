package shoaibhassan.asyn_task;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AsyncFragment  AsyncTask<String,Integer,Boolean> {

@Override
protected void onPreExecute() {
        }
@Override
protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

        }

@Override
protected Boolean doInBackground(String... params) {

        try {
        Thread.sleep(10000);
        if(params[0].equals("usama")&& params[1].equals("12345")){
        return true;
        }
        else
        {
        return false;
        }
        }
        catch (InterruptedException e)
        {
        e.printStackTrace();
        }
        publishProgress(1);
        return true;
        }


@Override
protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
        if(aBoolean==false) {

        Toast.makeText(getContext(), "wrong username or passward...", Toast.LENGTH_SHORT).show();
        }
        else {

        Intent i = new Intent(getContext(), NewActivity.class);
        startActivity(i);
        }
        }

        }
