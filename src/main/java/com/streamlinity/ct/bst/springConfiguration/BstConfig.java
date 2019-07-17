package com.streamlinity.ct.bst.springConfiguration;

import com.streamlinity.ct.bst.api.BstOpsInterface;
import com.streamlinity.ct.bst.solution.Bst;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 * Candidates:  Do NOT edit this - this controls the
 * Spring Configuration for your solution to be correct.
 */

@Configuration
@Profile("default")
public class BstConfig {

    @Bean
    public BstOpsInterface candidateBst() {
        return new Bst();
    }
}
