public boolean makeBricks(int small, int big, int goal) {
    int bigBricks = big * 5;
    while (goal < bigBricks) {
        bigBricks -= 5;
    }
    int remainder;
    if (bigBricks > 0) {
        remainder = goal - bigBricks;
    } else {
        remainder = goal;
    }
    if (small >= remainder) {
        return true;
    } else {
        return false;
    }
}

//huh this one looks like it will actually require some thinking probably i am guessing to use to % to see if i divide the goal by 5 is the remainder going to be less than or equal to the number of single bricks i have
//ok first attempt it worked for like half the examples i need to have a divide by zero thing and possibly i am not implementing this quite right
//ok i need to incorporate logic for if i dont use all my big bricks is why some of them are failing
//ok i fixed that but some of the test are still failing
//oh duh because i dont actually use % with the way i have swapped it around it needs to be a -
//well i used loops when they say i didnt have to but at least it works