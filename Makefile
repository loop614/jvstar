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

get_latest_star:
	wget http://localhost:6969/latest?object_id=123

get_total_star:
	wget http://localhost:6969/total?object_id=123

get_star:
	wget http://localhost:6969/star?object_id=123
