package com.example.nestedhash;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NestedAdapter extends RecyclerView.Adapter<NestedAdapter.NestedViewHolder>  {

    private List<String> list ;
  //  List<DataModel>mlist;

    public NestedAdapter(List<String> mList){
        this.list = mList;
    }

    @NonNull
    @Override
    public NestedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nested_item , parent , false);
        return new NestedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NestedViewHolder holder, int position) {


      //  DataModel model = mlist.get(position);

   //boolean isExpandable = model.isExpandable();
       // holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

//        if (isExpandable){
//            holder.mArrowImage.setImageResource(R.drawable.arrow_up);
//        }else{
//            holder.mArrowImage.setImageResource(R.drawable.arrow_down);
//        }

        NestedAdapter2 adapter = new NestedAdapter2(list);
        holder.nestedRecyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        holder.nestedRecyclerView.setHasFixedSize(true);
        holder.nestedRecyclerView.setAdapter(adapter);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //  model.setExpandable(!model.isExpandable());
                //list = model.getNestedList();
                notifyItemChanged(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class NestedViewHolder extends RecyclerView.ViewHolder{

        private final LinearLayout linearLayout;
        private final RecyclerView nestedRecyclerView;


        public NestedViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            RelativeLayout expandableLayout = itemView.findViewById(R.id.expandable_layout);
            nestedRecyclerView = itemView.findViewById(R.id.child_rv);




        }
    }

}
