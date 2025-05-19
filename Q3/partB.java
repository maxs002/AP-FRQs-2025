public ArrayList<Match> buildMatches() { 
        ArrayList<Match> matchUp = new ArrayList<Match>(); 
        int start = 0;

        if (competitorList.size() % 2 == 1) {
            start = 1;
        }
        for (int i = start; i < start + (competitorList.size() - start) / 2; i++) {
            matchUp.add(new Match(competitorList.get(i), competitorList.get(competitorList.size()-1-(i-start))));
        }
    }
    return matchUp;
}
