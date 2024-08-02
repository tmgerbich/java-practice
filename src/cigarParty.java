public boolean cigarParty(int cigars, boolean isWeekend) {
    if (cigars >= 40 && cigars <= 60){
        return true;
    } else if (cigars > 60 && isWeekend){
        return true;
    }
    else {
        return false;
    }
}

//boolean so just going to set up conditions for the true or false using if else if else statements