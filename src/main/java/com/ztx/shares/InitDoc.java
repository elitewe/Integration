package com.ztx.shares;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;

//生成接口文档
public class InitDoc {
    public static void main(String[] args) {
        DocsConfig config = new DocsConfig();
        config.setProjectPath("C:\\Users\\computer\\Desktop\\StockSpark"); // 项目根目录
//        config.setProjectName("ProjectName"); //  项目名称
        config.setApiVersion("V1.0");       // 声明该API的版本
        config.setDocsPath("C:\\Users\\computer\\Desktop\\StockSpark\\apidocs"); // 生成API 文档所在目录
        config.setAutoGenerate(Boolean.TRUE);  // 配置自动生成
        Docs.buildHtmlDocs(config); // 执行生成文档
    }
}
