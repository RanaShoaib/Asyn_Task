package shoaibhassan.asyn_task;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import static java.security.AccessController.getContext;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    ProgressBar progressBar;
    EditText e1,e2;
    Button b;
    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_login,container,false);
        e1=(EditText) view.findViewById(R.id.editText);
        e2= (EditText) view.findViewById(R.id.editText2);
        b=(Button) view.findViewById(R.id.button);
        progressBar=(ProgressBar) view.findViewById(R.id.progressBar3);

        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {

                new AsyncFragment().execute(e1.getText().toString(),e2.getText().toString());

            }


        });
        Log.d("Mytag","back from Asynck fragment");
        return view;
    }
}





