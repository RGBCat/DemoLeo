package com.shop.saas;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MpGenerator {

    public static void main(String[] args) throws ParseException {
        codeGenerator(Arrays.asList("t_inventory_history","t_inventory_bill_item"));
    }
    public static void codeGenerator(List<String> tables){
        for (String table:tables) {
            // 代码生成器
            AutoGenerator mpg = new AutoGenerator();
            // 全局配置
            GlobalConfig gc = new GlobalConfig();
            final String projectPath = System.getProperty("user.dir");
            gc.setOutputDir(projectPath + "/src/main/java");
            gc.setAuthor("hanlq");
            gc.setOpen(false);
            gc.setServiceName("%sService");
            gc.setMapperName("%sMapper");
            gc.setControllerName("%sController");
            gc.setSwagger2(true);
            gc.setActiveRecord(true);
            gc.setFileOverride(true);
            mpg.setGlobalConfig(gc);

            // 数据源配置
            DataSourceConfig dsc = new DataSourceConfig();
            dsc.setUrl("jdbc:mysql://192.168.5.51:3306/saas_dev?useUnicode=true&characterEncoding=UTF8&zeroDateTimeBehavior=convertToNull&autoReconnect=true&transformedBitIsBoolean=true&useSSL=false&serverTimezone=Asia/Shanghai&allowMultiQueries=true");
            dsc.setDriverName("com.mysql.jdbc.Driver");
            dsc.setUsername("root");
            dsc.setPassword("GYqEH754AF4E2rJi");
            dsc.setTypeConvert(new MySqlTypeConvert() {
                @Override
                public DbColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
                    System.out.println("转换类型：" + fieldType);
//                    //tinyint转换成Boolean
//                    if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
//                        return DbColumnType.BOOLEAN;
//                    }
                    //将数据库中datetime转换成date
                    if ( fieldType.toLowerCase().contains( "datetime" ) ) {
                        return DbColumnType.DATE;
                    }//将数据库中datetime转换成date
                    if ( fieldType.toLowerCase().contains( "timestamp" ) ) {
                        return DbColumnType.DATE;
                    }
                    return (DbColumnType) super.processTypeConvert(globalConfig, fieldType);
                }
            });

            mpg.setDataSource(dsc);


            // 包配置
            PackageConfig pc = new PackageConfig();
            pc.setEntity("model");
            pc.setParent("com.shop.saas");
            mpg.setPackageInfo(pc);

            // 自定义配置
            InjectionConfig cfg = new InjectionConfig() {
                @Override
                public void initMap() {
                    // to do nothing
                }
            };
            List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
            focList.add(new FileOutConfig("templates/mapper.xml.ftl") {
                @Override
                public String outputFile(TableInfo tableInfo) {
                    // 自定义输入文件名称
                    String entityName = tableInfo.getEntityName();
                    return projectPath + "/src/main/resources/mapper/"
                            + "/" + entityName
                            + "Mapper" + StringPool.DOT_XML;
                }
            });
            cfg.setFileOutConfigList(focList);
            mpg.setCfg(cfg);
            mpg.setTemplate(new TemplateConfig().setXml(null));

            // 策略配置
            StrategyConfig strategy = new StrategyConfig();
            strategy.setNaming(NamingStrategy.underline_to_camel);
            strategy.setColumnNaming(NamingStrategy.underline_to_camel);
            strategy.setEntityLombokModel(true);
            strategy.setRestControllerStyle(true);
            strategy.setInclude(table);
            strategy.setControllerMappingHyphenStyle(true);
            strategy.setTablePrefix("t_");
            mpg.setStrategy(strategy);
            mpg.setTemplateEngine(new FreemarkerTemplateEngine());
            mpg.execute();
        }
    }
}


