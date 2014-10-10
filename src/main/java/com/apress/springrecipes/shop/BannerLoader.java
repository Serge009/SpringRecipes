package com.apress.springrecipes.shop;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Matrix on 10.10.2014.
 */
public class BannerLoader implements ResourceLoaderAware {

    private ResourceLoader resourceLoader;


    private Resource banner;

    @Required
    public void setBanner(Resource banner) {
        this.banner = banner;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void showBanner() throws IOException {
        //Resource banner = resourceLoader.getResource("classpath:banner.txt");
        InputStream in = banner.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        while (true) {
            String line = reader.readLine();
            if (line == null)
                break;
            System.out.println(line);
        }
        reader.close();
    }
}
