package br.com.test.comandaeletronica.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import br.com.comandaeletronica.util.AppContext;

@Configuration
@Import(value = { AppContext.class })
@ComponentScan(basePackages = { "br.com.test.comandaeletronica" })
public abstract class AppContextTest {

}
