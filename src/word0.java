public Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    for(String string:strings){
        map.put(string, 0);
    }
    return map;
}

//seems pretty simple make a map then use a loop to fill up the map
//getting an error expecting '(' or '[' expected line:2 but all that is doing is creating the map?
//java.util.Map is abstract; cannot be instantiated line:2 i guess i will use a HashMap then
//this one was a bigger hassle than i expected i guess i need to review maps