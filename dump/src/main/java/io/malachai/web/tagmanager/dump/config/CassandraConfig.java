package io.malachai.web.tagmanager.dump.config;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraTemplateFactoryBean;
import org.springframework.data.cassandra.config.CqlSessionFactoryBean;
import org.springframework.data.cassandra.core.mapping.UserTypeResolver;
import org.springframework.data.cassandra.repository.support.CassandraRepositoryFactoryBean;
import reactor.util.annotation.NonNullApi;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Override
    protected String getContactPoints() {
        return "localhost";
    }

    @Override
    protected String getKeyspaceName() {
        return "dump";
    }

    @Override
    public CqlSessionFactoryBean cassandraSession() {
        CqlSessionFactoryBean session = super.cassandraSession();
        session.setUsername("cassandra");
        session.setPassword("cassandra");
        return session;
    }
}
