package BookMyShow.Actors;

import BookMyShow.Entities.Search;

public class Admin implements User{
    Integer userId;
    Search searchObj;

    public void addMovies(){

    }
    public void addShow(){

    }

    @Override
    public Integer getUserId() {
        return userId;
    }

    @Override
    public Search getSearchObject() {
        return searchObj;
    }
}
