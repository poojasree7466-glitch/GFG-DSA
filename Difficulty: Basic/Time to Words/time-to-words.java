class Solution {
    public String timeToWords(int h, int m) {
        String[] words = {
            "", "one", "two", "three", "four", "five",
            "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen", "twenty", "twenty one", "twenty two",
            "twenty three", "twenty four", "twenty five",
            "twenty six", "twenty seven", "twenty eight",
            "twenty nine", "thirty", "thirty one", "thirty two",
            "thirty three", "thirty four", "thirty five",
            "thirty six", "thirty seven", "thirty eight",
            "thirty nine", "forty", "forty one", "forty two",
            "forty three", "forty four", "forty five",
            "forty six", "forty seven", "forty eight",
            "forty nine", "fifty", "fifty one", "fifty two",
            "fifty three", "fifty four", "fifty five",
            "fifty six", "fifty seven", "fifty eight", "fifty nine"
        };

        if (m == 0) {
            return words[h] + " o' clock";
        }

        if (m == 15) {
            return "quarter past " + words[h];
        }

        if (m == 30) {
            return "half past " + words[h];
        }

        if (m < 30) {
            return words[m] + " minutes past " + words[h];
        }

        if (m == 45) {
            int nextHour = h + 1;

            if (nextHour == 12) {
                nextHour = 12;
            }

            return "quarter to " + words[nextHour];
        }

        int nextHour = h + 1;

        if (nextHour == 12) {
            nextHour = 12;
        }

        return words[60 - m] + " minutes to " + words[nextHour];
    }
}