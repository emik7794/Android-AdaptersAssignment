package ar.edu.unc.famaf.redditreader.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import ar.edu.unc.famaf.redditreader.R;
import ar.edu.unc.famaf.redditreader.backend.Backend;
import ar.edu.unc.famaf.redditreader.model.PostModel;


/**
 * A placeholder fragment containing a simple view.
 */
public class NewsActivityFragment extends Fragment {

    public NewsActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);

        Backend backend = Backend.getInstance();
        List<PostModel> listPostModel = backend.getTopPosts();

        //PostAdapter(Context context, int textViewResourseId, List<PostModel> postList)
        PostAdapter postAdapter = new PostAdapter(getContext(), R.layout.post_row, listPostModel);

        ListView postsLV = (ListView) view.findViewById(R.id.postsLV);
        postsLV.setAdapter(postAdapter);

        return view;
    }
}
