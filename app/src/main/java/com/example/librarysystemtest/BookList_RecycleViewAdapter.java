package com.example.librarysystemtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BookList_RecycleViewAdapter extends RecyclerView.Adapter<BookList_RecycleViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<BookListModel> bookListModels;

    public BookList_RecycleViewAdapter(Context context, ArrayList<BookListModel> bookListModels) {
        this.context = context;
        this.bookListModels = bookListModels;
    }

    @NonNull
    @Override
    public BookList_RecycleViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.book_list_row, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookList_RecycleViewAdapter.MyViewHolder holder, int position) {
        holder.txtBookName.setText(bookListModels.get(position).getBookName());
        holder.txtBookAuthor.setText(bookListModels.get(position).getBookAuthor());
        holder.txtBookCategory.setText(bookListModels.get(position).getBookCategory());
        holder.imgViewBookCover.setImageResource(bookListModels.get(position).getBookImages());
    }

    @Override
    public int getItemCount() {
        return bookListModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtBookName;
        TextView txtBookAuthor;
        TextView txtBookCategory;
        ImageView imgViewBookCover;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtBookName = itemView.findViewById(R.id.txBookName);
            txtBookAuthor = itemView.findViewById(R.id.txtBookAuthor);
            txtBookCategory = itemView.findViewById(R.id.txtBookCategory);
            imgViewBookCover = itemView.findViewById(R.id.imageViewBookCover);
        }
    }

}
