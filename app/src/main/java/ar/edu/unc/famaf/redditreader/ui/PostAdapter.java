package ar.edu.unc.famaf.redditreader.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ar.edu.unc.famaf.redditreader.R;

import ar.edu.unc.famaf.redditreader.model.PostModel;

public class PostAdapter extends ArrayAdapter<PostModel> {

    private List<PostModel> postList = null;

    public PostAdapter(Context context, int textViewResourseId, List<PostModel> postList) {
        super(context, textViewResourseId);
        this.postList = postList;
    }


    @Override
    public int getCount() {
        return postList.size();
    }

    @Override
    public int getPosition(PostModel item) {
        return postList.indexOf(item);
    }

    @Override
    public PostModel getItem(int position) {
        return postList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater vi = (LayoutInflater) getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = vi.inflate(R.layout.post_row, null);
        }

        PostModel pm = postList.get(position);

        TextView titleText = (TextView) convertView.findViewById(R.id.titleTV);
        TextView authorText = (TextView) convertView.findViewById(R.id.authorTV);
        TextView commentsText = (TextView) convertView.findViewById(R.id.commentsTV);
        TextView dateText = (TextView) convertView.findViewById(R.id.dateTV);
        ImageView previewImageId = (ImageView) convertView.findViewById(R.id.previewIV);

        titleText.setText(pm.getTitle());
        authorText.setText(pm.getAuthor());
        commentsText.setText(String.valueOf(pm.getComments()));
        dateText.setText(pm.getDate());
        previewImageId.setImageResource(pm.getPreviewId());

        return convertView;
    }


}
