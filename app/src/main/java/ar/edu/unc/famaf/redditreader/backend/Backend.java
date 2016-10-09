package ar.edu.unc.famaf.redditreader.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ar.edu.unc.famaf.redditreader.model.PostModel;

public class Backend {
    private static Backend ourInstance = new Backend();

    public static Backend getInstance() {
        return ourInstance;
    }

    private Backend() {
    }

    public List<PostModel> getTopPosts() {
        List<PostModel> postModelsList = new ArrayList<>();

        PostModel postModel1 = new PostModel();
        PostModel postModel2 = new PostModel();
        PostModel postModel3 = new PostModel();
        PostModel postModel4 = new PostModel();
        PostModel postModel5 = new PostModel();

        postModel1.setTitle("title1");
        postModel2.setTitle("title2");
        postModel3.setTitle("title3");
        postModel4.setTitle("title4");
        postModel5.setTitle("title5");

        postModel1.setAuthor("author1");
        postModel2.setAuthor("author2");
        postModel3.setAuthor("author3");
        postModel4.setAuthor("author4");
        postModel5.setAuthor("author5");

        postModel1.setDate("date1");
        postModel2.setDate("date2");
        postModel3.setDate("date3");
        postModel4.setDate("date4");
        postModel5.setDate("date5");

        postModel1.setComments(10);
        postModel2.setComments(20);
        postModel3.setComments(30);
        postModel4.setComments(40);
        postModel5.setComments(50);

        postModel1.setPreviewId(1);
        postModel2.setPreviewId(2);
        postModel3.setPreviewId(3);
        postModel4.setPreviewId(4);
        postModel5.setPreviewId(5);

        Collections.addAll(postModelsList, postModel1, postModel2, postModel3, postModel4, postModel5);

        return postModelsList;
    }
}
