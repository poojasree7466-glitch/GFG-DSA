class Solution {
    public String timeGap(String st, String et) {
        String[] a = st.split(":");
        String[] b = et.split(":");

        int start = Integer.parseInt(a[0]) * 3600
                  + Integer.parseInt(a[1]) * 60
                  + Integer.parseInt(a[2]);

        int end = Integer.parseInt(b[0]) * 3600
                + Integer.parseInt(b[1]) * 60
                + Integer.parseInt(b[2]);

        int diff = end - start;

        int h = diff / 3600;
        diff %= 3600;

        int m = diff / 60;
        int s = diff % 60;

        return String.format("%02d:%02d:%02d", h, m, s);
    }
}