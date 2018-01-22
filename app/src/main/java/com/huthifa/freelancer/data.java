package com.huthifa.freelancer;

/**
 * Created by HK on 31/08/2017.
 */

public class data {

    public class Data {
        private String names,site;
        private Integer image;

        public Data(String Names, Integer Image, String Site) {
            this.names = Names;
            this.image = Image;
            this.site = Site;
        }


        public String getNames() {
            return this.names;
        }

        public String getSite() {
            return this.site;
        }

        public Integer getImage() {
            return this.image;
        }
    }
}
