package Leetcode_daily;
//https://leetcode.com/problems/compare-version-numbers/description/?envType=daily-question&envId=2025-09-23
public class Compare_versionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1Parts = version1.split("\\.");
        String[] v2Parts = version2.split("\\.");

        int maxLength = Math.max(v1Parts.length, v2Parts.length);

        for (int i = 0; i < maxLength; i++) {
            int val1 = (i < v1Parts.length) ? Integer.parseInt(v1Parts[i]) : 0;
            int val2 = (i < v2Parts.length) ? Integer.parseInt(v2Parts[i]) : 0;

            if (val1 < val2) {
                return -1;
            } else if (val1 > val2) {
                return 1;
            }
        }

        return 0;

    }
}
