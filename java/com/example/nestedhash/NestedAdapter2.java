package com.example.nestedhash;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NestedAdapter2 extends RecyclerView.Adapter<NestedAdapter2.NestedViewHolder> {

    List<String> list;

    public NestedAdapter2(List<String> list) {

        this.list = list;

    }

    @NonNull
    @Override
    public NestedAdapter2.NestedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nested_item2, parent, false);
        return new NestedAdapter2.NestedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NestedViewHolder holder, int position) {
        //   holder.mTv.setText(list.get(position));

    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NestedViewHolder extends RecyclerView.ViewHolder {
        private TextView mTv;

        public NestedViewHolder(@NonNull View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.nestedItemTv);

        }
    }


}
