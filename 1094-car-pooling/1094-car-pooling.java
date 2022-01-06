class Trip {

    int from;
    int to;

    public Trip(int passengers, int from, int to) {
        this.from = from;
        this.to = to;
        this.passengers = passengers;
    }

    int passengers;

}

class Solution {
   public boolean carPooling(int[][] trips, int capacity) {
        int currentCapacity = 0;
        List<Trip> alltrips = new ArrayList<Trip>();
        for(int[] trip: trips){
            alltrips.add(new Trip(trip[0], trip[1], trip[2]));
        }
       
        List<Trip> notCompletedTrips =  Collections.synchronizedList(new ArrayList<>());
       
        alltrips.sort(new Comparator<Trip>() {
            @Override
            public int compare(Trip o1, Trip o2) {
                if(o1.from-o2.from==0){
                    return o1.to-o2.to;
                }
                return o1.from - o2.from;
            }
        });
       
        for (int i = 0; i < alltrips.size() ; i++) {
            for (Trip t : notCompletedTrips) {
                if (t.to <= alltrips.get(i).from) {
                    currentCapacity -= t.passengers;
                    t.passengers=0;
                    // notCompletedTrips.get(t);

                }
            }

                currentCapacity += alltrips.get(i).passengers;
                notCompletedTrips.add(alltrips.get(i));
                if (currentCapacity > capacity) {
                    return false;
                }

        }

        return true;

    }
}