db:
	docker compose up jvstar_postgres

run:
	./mvnw spring-boot:run

clean:
	./mvnw clean

clean_install:
	./mvnw -T 4 clean install

dependency_tree:
	./mvnw dependency tree

dependency_analyse:
	./mvnw dependency analyse

validate:
	./mvnw validate

install:
	./mvnw install

package:
	./mvnw package

compile:
	./mvnw compile

test:
	./mvnw test
