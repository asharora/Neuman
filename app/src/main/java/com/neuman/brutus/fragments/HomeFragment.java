package com.neuman.brutus.fragments;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.neuman.brutus.R;

import java.util.Calendar;

public class HomeFragment extends Fragment implements View.OnClickListener {
    Button filters,addfilter;
    LinearLayout linearLayout;
    TextView calendar1,calendar2,calendar3;
    DatePickerDialog.OnDateSetListener mDatasetListener;
    private View view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        linearLayout=getView().findViewById(R.id.filterlayout);
        filters =getView().findViewById(R.id.filters);
        addfilter=getView().findViewById(R.id.addfilter);
        calendar1=getView().findViewById(R.id.calender1);
        calendar2=getView().findViewById(R.id.calender2);
        calendar3=getView().findViewById(R.id.calender3);

        ////////////////////////////////////////////////////////////
        calendar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                int year=c.get(Calendar.YEAR);
                int month=c.get(Calendar.MONTH);
                int day=c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(getActivity(), mDatasetListener,year,month,day);

                dialog.getWindow();
                dialog.show();
                mDatasetListener=new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        calendar1.setText(i2+"/"+i1+"/"+i);
                    }
                };
            }
        });

        ////////////////////////////////////////////////////////////
        calendar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                int year=c.get(Calendar.YEAR);
                int month=c.get(Calendar.MONTH);
                int day=c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(getActivity(), mDatasetListener,year,month,day);

                dialog.getWindow();
                dialog.show();
                mDatasetListener=new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        calendar2.setText(i2+"/"+i1+"/"+i);
                    }
                };
            }
        });

        //////////////////////////////////////////////////////
        calendar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar c=Calendar.getInstance();
                int year=c.get(Calendar.YEAR);
                int month=c.get(Calendar.MONTH);
                int day=c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(getActivity(), mDatasetListener,year,month,day);

                dialog.getWindow();
                dialog.show();
                mDatasetListener=new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        calendar3.setText(i2+"/"+i1+"/"+i1);
                    }
                };
            }
        });


        ////////////////////////////////////////////////////
        filters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linearLayout.setVisibility(View.VISIBLE);
            }
        });

        ////////////////////////////////////////////////////
        addfilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linearLayout.setVisibility(View.INVISIBLE);
            }
        });
    }


    @Override
    public void onStart() {
        super.onStart();


    }

    @Override
    public void onClick(View view) {
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog dialog=new DatePickerDialog(getActivity(), mDatasetListener,year,month,day);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
       mDatasetListener=new DatePickerDialog.OnDateSetListener() {
           @Override
           public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
               calendar1.setText(i+"  "+i1+"  "+i2);
           }
       };
    }
}
