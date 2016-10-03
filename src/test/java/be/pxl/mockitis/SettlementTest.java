package be.pxl.mockitis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SettlementTest {

    @Test
    public void settlement_WhenMoreSettlersAssignedToDefenseThanAmountOfRaiders_CanDefendItself() throws Exception {
    	Raiders raiders = new RaiderTestBuilder()
    	.hasLegendary(false)
    	.numberOfRaiders(1)
    	.build();

        Settlement settlement = new SettlementTestBuilder()
        .AmountOfPlebs(2)
        .AmountOfDefenders(2)
        .build();

        assertThat(settlement.defend(raiders)).isTrue();
    }

    @Test
    public void settlement_WhenEqualSettlersAssignedToDefenseThanAmountOfRaiders_CanDefendItself() throws Exception {
    	Raiders raiders = new RaiderTestBuilder()
    	.hasLegendary(false)
    	.numberOfRaiders(1)
    	.build();

        Settlement settlement = new SettlementTestBuilder()
        .AmountOfPlebs(2)
        .AmountOfDefenders(1)
        .build();

        assertThat(settlement.defend(raiders)).isTrue();
    }

    @Test
    public void settlement_WhenLessSettlersAssignedToDefenseThanAmountOfRaiders_CanNotDefendItself() throws Exception {
    	Raiders raiders = new RaiderTestBuilder()
    	.hasLegendary(false)
    	.numberOfRaiders(9001)
    	.build();

        Settlement settlement = new SettlementTestBuilder()
        .AmountOfPlebs(2)
        .AmountOfDefenders(1)
        .build();

        assertThat(settlement.defend(raiders)).isFalse();
    }
}
