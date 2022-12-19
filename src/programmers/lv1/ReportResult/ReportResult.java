package programmers.lv1.ReportResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReportResult {
    public int[] solution(String[] idList, String[] report, int k) {
        Set<String> reportList = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> reportCount =  new HashMap<>();
        Map<String, Integer> reportResult =  new LinkedHashMap<>();
        Map<String, List<String>> reporter =  new LinkedHashMap<>();

        for(var id : idList){
            reportCount.put(id, 0);
            reportResult.put(id, 0);
            reporter.put(id, new ArrayList<>());
        }

        for(var reportDetail : reportList){
            String[] split = reportDetail.split(" ");
            reportCount.computeIfPresent(split[1], (s, count) -> count+1);
            reporter.get(split[0]).add(split[1]);
        }

        for(var reportDetail : reportList){
            String[] split = reportDetail.split(" ");
            if(reportCount.get(split[1]) >= k){
                reportResult.computeIfPresent(split[0], (s,i) -> i+1);
            }
        }
        return reportResult.values().stream().mapToInt(i->i).toArray();
    }
}
