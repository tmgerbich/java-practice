public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation){
        return true;
    } else {
        return false;
    }
}

//this was a very simple problem, two conditions either of which could be satisfied to return true otherwise false