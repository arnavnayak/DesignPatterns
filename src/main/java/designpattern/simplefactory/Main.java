package designpattern.simplefactory;

public class Main {

    public static void main(String[] args) {
//        Post post = PostFactory.createPost("blog"); //for blog post
//        Post post = PostFactory.createPost("news"); // for news post
        Post post = PostFactory.createPost("product"); //for product post

        System.out.println(post);
    }
}
