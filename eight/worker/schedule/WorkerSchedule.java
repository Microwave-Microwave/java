package worker.schedule;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Map.Entry;


public class WorkerSchedule
{
    private HashMap<Integer, HashSet<String>> week_to_workers = new HashMap<Integer, HashSet<String>>();

    public WorkerSchedule()
    {

    }

    //1-52-es hét
    public void add(int week, HashSet<String> new_workers)
    {
        week--; //0-51es index tartományra
        if (!week_to_workers.containsKey(week))
            week_to_workers.put(week, new HashSet<String>());

        HashSet<String> workers = week_to_workers.get(week);
        for (String worker : new_workers)
        {
            workers.add(worker);
        }
    }

    
    public void add(HashSet<Integer> weeks, ArrayList<String> new_workers)
    {
        HashSet<String> nws = new HashSet<String>();
        nws.addAll(new_workers);

        for (Integer week : weeks)
        {
            add(week, nws);
        }
    }

    public Boolean isWorkingOnWeek(String worker, int week)
    {
        week--;
        if (!week_to_workers.containsKey(week))
            return false;
        else
        {
            HashSet<String> workers = week_to_workers.get(week);
            return worker.contains(worker);
        }
    }

    public HashSet<Integer> getWorkWeeks(String worker)
    {
        HashSet<Integer> assigment = new HashSet<Integer>();
        for (Entry<Integer, HashSet<String>> e : week_to_workers.entrySet())
        {
            Integer week = e.getKey();
            if (isWorkingOnWeek(worker, week))
                assigment.add(week);
        }
        return assigment;
    }

    public boolean emptySchedule()
    {
        return week_to_workers.isEmpty();
    }
}