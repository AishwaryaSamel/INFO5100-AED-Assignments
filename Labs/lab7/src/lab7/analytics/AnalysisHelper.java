/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;


public class AnalysisHelper {
    
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
         System.out.println("************************1*****************************");
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
            
    }
    
    public void getPostMostLikedComments() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer,Integer> noOfLikes = new HashMap<Integer,Integer>();
        for (Comment c : comments.values()) {
            noOfLikes.put(c.getPostId(),c.getLikes());
        }
        //System.out.println("map"+noOfLikes);
        
       Map.Entry maxEntry = null;
        for (Map.Entry me : noOfLikes.entrySet()) {
            if(maxEntry == null || (Integer)(me.getValue())>(Integer)(maxEntry.getValue())){
                maxEntry = me;
        }
        }
        System.out.println("**********************2*******************************");
        System.out.println("POST ID WITH MOST LIKED COMMENTS " + maxEntry.getKey());
        System.out.println("NUMBER OF COMMENTS " + maxEntry.getValue());
    }
    
    public void getPostMostComments(){
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer,Integer> noOfComments = new HashMap<Integer,Integer>();
        
        for(Post p : posts.values()){
            noOfComments.put(p.getPostId(),p.getComments().size());
        }
        Map.Entry maxEntry = null;
        for (Map.Entry me : noOfComments.entrySet()) {
            if(maxEntry == null || (Integer)(me.getValue())>(Integer)(maxEntry.getValue())){
                maxEntry = me;
        }
        }
        System.out.println("************************3*****************************");
        //System.out.println("listtt" + noOfComments);
        System.out.println("POST ID WITH MOST COMMENTS " + maxEntry.getKey());
        System.out.println("NUMBER OF COMMENTS " + maxEntry.getValue());
        
    }
     public void getInactiveOnPosts(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        //HashMap<Integer,HashSet> userList = new HashMap<Integer,HashSet>();
        HashMap<Integer,Integer> userList = new HashMap<Integer,Integer>();
        
        for (User u : users.values()) {
            ArrayList<Integer> postList = new ArrayList<>();
            for(Comment c : u.getComments()){
                postList.add(c.getPostId());
            }
            
            HashSet<Integer> postListSet = new HashSet<Integer>(postList);
            userList.put(u.getId(),postListSet.size()); 
            }
        //System.out.println(users);
        //System.out.println(userList);
        Map<Integer, Integer> userListSorted = sortByValue(userList);
        //System.out.println(userListSorted);
        System.out.println("************************4*****************************");
        System.out.println("TOP FIVE INACTIVE USERS BASED ON POSTS");
        System.out.println(userList.get(3));
        int counter = 0;
        for(Map.Entry<Integer,Integer> me : userListSorted.entrySet()){
            System.out.println("User ID " + me.getKey());
            System.out.println("Total Posts " + me.getValue());
            counter ++;
            if((counter ==5)){
                break;
            }
        }
        
    }
    public void getInactiveOnComments(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        HashMap<Integer,Integer> commentNoList = new HashMap<Integer,Integer>();
        for(User u : users.values()){
            commentNoList.put(u.getId(),u.getComments().size());
        }
        Map<Integer, Integer> commentNoListSorted = sortByValue(commentNoList);
        System.out.println("**********************5*******************************");
        System.out.println("TOP FIVE INACTIVE USERS BASED ON COMMENTS");
        int counter = 0;
        for(Map.Entry<Integer,Integer> me : commentNoListSorted.entrySet()){
            System.out.println("User ID " + me.getKey());
            System.out.println("Total Comments " + me.getValue());
            counter ++;
            if((counter ==5)){
                break;
            }
        }
        //System.out.println("listtt" + commentNoListSorted);
    }
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 
   
    
    public void getInactiveOverall(){
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        HashMap<Integer,Integer> userList = new HashMap<Integer,Integer>();
        for (User u : users.values()) {
            int noOfLikes = 0;
            int noOfComments = 0;
            int noOfPosts = 0;
            for(Comment c : u.getComments()){
                noOfLikes += c.getLikes();
                noOfComments = u.getComments().size();
                noOfPosts = u.getComments().size();
            }
            userList.put(u.getId(),noOfLikes+noOfComments+noOfPosts);
        }
        
        Map<Integer, Integer> userListSorted = sortByValue(userList);
        System.out.println("***********************6******************************");
        System.out.println("TOP FIVE INACTIVE USERS OVERALL");
        int counter = 0;
        for(Map.Entry<Integer,Integer> me : userListSorted.entrySet()){
            System.out.println("User ID " + me.getKey());
            System.out.println("Total Comments+Posts+Likes " + me.getValue());
            counter ++;
            if((counter ==5)){
                break;
            }
        }
        //System.out.println(userListSorted);
        
    }
//    public void getProactiveOverall(){
//        Map<Integer, User> users = DataStore.getInstance().getUsers();
//        HashMap<Integer,Integer> userList = new HashMap<Integer,Integer>();
//        for (User u : users.values()) {
//            int noOfLikes = 0;
//            int noOfComments = 0;
//            int noOfPosts = 0;
//            for(Comment c : u.getComments()){
//                noOfLikes += c.getLikes();
//                noOfComments = u.getComments().size();
//                noOfPosts = u.getComments().size();
//            }
//            userList.put(u.getId(),noOfLikes+noOfComments+noOfPosts);
//        }
//        
//        //Map<Integer, Integer> userListSorted = sortByValue(userList);
//        Map<Integer, Integer> userListSorted = new TreeMap<>(Collections.reverseOrder());
//        //userListSorted = sortByValue(userList);
//        System.out.println("***********************7******************************");
//        System.out.println("TOP FIVE PROACTIVE USERS OVERALL");
//        int counter = 0;
//        for(Map.Entry<Integer,Integer> me : userListSorted.entrySet()){
//            //int counter = userListSorted.size();
//            System.out.println("User ID " + me.getKey());
//            System.out.println("Total Comments " + me.getValue());
//            counter ++;
//            if((counter ==5)){
//                break;
//            }
//        }
//        //System.out.println(userListSorted);
//        
//    }
    
   public void getProactiveOverall(){
           Map<Integer, User> user = DataStore.getInstance().getUsers();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Integer> proactiveOverall = new HashMap<>();
        
        for(User users: user.values()){
            proactiveOverall.put(users.getId(), users.getComments().size());
        }
        
        for(Post post: posts.values()){
            proactiveOverall.put(post.getUserId(), proactiveOverall.get(post.getUserId())+1);
        }
        
        for(Comment comment : comments.values()){
            proactiveOverall.put(comment.getUserId(), proactiveOverall.get(comment.getUserId()) + comment.getLikes());
        }
        
        
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(proactiveOverall.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println("***********************7******************************");
        System.out.println("TOP FIVE PROACTIVE USERS OVERALL");
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            if (count >= 5) {
                return;
            }
            System.out.println("User ID " + entry.getKey());
            System.out.println("Total Comments+Posts+Likes " + entry.getValue());
            count++;
        }
    }
    
}
