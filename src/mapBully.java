public class mapBully public Map<String, String> mapBully(Map<String, String> map) {
    if (map.containsKey("a")) {
        map.put("b", map.get("a"));
        map.put("a", "");
    }
    return map;
}

//start with if because there is a logic in the problem
//got a little confused on the return statements have not really had many examples where we returned the argument just maybe with or without a modification but figured it out eventually
//also realizing how many little parentheses and braces intelliJ just adds in and i'm used to that and i have to go back and manually add the missing ones in basically every line after i think i've got it done
