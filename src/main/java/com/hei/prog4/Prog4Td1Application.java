package com.hei.prog4;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Prog4Td1Application {

	public static void main(String[] args) {
		SpringApplication.run(Prog4Td1Application.class, args);

		ClassSingleton classSingleton1 = ClassSingleton.getInstance();
		ClassSingleton classSingleton2 = ClassSingleton.getInstance();
		log.info(classSingleton1.getDescription());
		log.info(classSingleton2.getDescription());
		classSingleton1.setDescription("mod1");
		log.info(classSingleton1.getDescription());
		log.info(classSingleton2.getDescription());
		classSingleton1.setDescription("mod2");
		classSingleton2.setDescription("mod3");
		log.info(classSingleton1.getDescription());
		log.info(classSingleton2.getDescription());


		ClassUniqueInstance classUniqueInstance1 = ClassUniqueInstance.INSTANCE;
		ClassUniqueInstance classUniqueInstance2 = ClassUniqueInstance.INSTANCE;
		log.info(String.valueOf(classUniqueInstance1.getClick()));
		log.info(String.valueOf(classUniqueInstance2.getClick()));

		classUniqueInstance1.setClick(2);
		log.info(String.valueOf(classUniqueInstance1.getClick()));
		log.info(String.valueOf(classUniqueInstance2.getClick()));

		classUniqueInstance1.setClick(3);
		classUniqueInstance2.setClick(4);

		log.info(String.valueOf(classUniqueInstance1.getClick()));
		log.info(String.valueOf(classUniqueInstance2.getClick()));
	}

}
