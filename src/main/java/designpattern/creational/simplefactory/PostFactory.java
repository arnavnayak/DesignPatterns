package designpattern.creational.simplefactory;

// this class acts as a simple factory for creation of different posts on website
public class PostFactory {

    public static Post createPost(String type){
     switch (type){
         case "blog": return new BlogPost();
         case "product": return new ProductPost();
         case "news": return new NewsPost();
         default: throw new IllegalArgumentException("Wrong post type passed");
     }
    }
}
