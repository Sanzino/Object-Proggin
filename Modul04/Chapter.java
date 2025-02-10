

    public class Chapter {

        private String title;

        private int chapterNumber;

        private int readingTime;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getChapterNumber() {
            return chapterNumber;
        }
        public void setChapterNumber(int chapterNumber) {
            this.chapterNumber = chapterNumber;
        }

        public int getReadingTime() {
            return readingTime;
        }
        public void setReadingTime(int readingTime) {
            this.readingTime = readingTime;
        }

        public void printChapter(){
            System.out.println("");
        }

        @Override
        public String toString() {
            return "Chapter{" +
                    "title='" + title + '\'' +
                    ", chapterNumber=" + chapterNumber +
                    ", readingTime=" + readingTime +
                    '}';
        }
    }

