package Tests.gridlab.ModulesItemsTests.ResidentalTests;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.Residental.House;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Vector;

/**
 * Created by Dylek on 2016-05-25.
 */
public class HouseTest extends TestCase {
    private House objectTest=new House();
    private Vector<Property> ps= new Vector<>();
    private Property p1;
    private Property p2;
    private Property p3;

    public void createPs(){
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);
    }

    @Test
    public void testConstructor(){
        objectTest=new House();assertEquals("name", objectTest.GetProperties().elementAt(0).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(0).GetUnit());

        assertEquals("parent", objectTest.GetProperties().elementAt(1).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(1).GetUnit());

        assertEquals("weather ", objectTest.GetProperties().elementAt(2).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(2).GetUnit());

        assertEquals("floor_area", objectTest.GetProperties().elementAt(3).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(3).GetValue());
        assertEquals("sf", objectTest.GetProperties().elementAt(3).GetUnit());

        assertEquals("gross_wall_area ", objectTest.GetProperties().elementAt(4).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(4).GetValue());
        assertEquals("sf", objectTest.GetProperties().elementAt(4).GetUnit());

        assertEquals("ceiling_height", objectTest.GetProperties().elementAt(5).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(5).GetValue());
        assertEquals("ft", objectTest.GetProperties().elementAt(5).GetUnit());

        assertEquals("aspect_ratio", objectTest.GetProperties().elementAt(6).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(6).GetUnit());

        assertEquals("envelope_UA", objectTest.GetProperties().elementAt(7).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(7).GetValue());
        assertEquals("Btu/degF.h", objectTest.GetProperties().elementAt(7).GetUnit());

        assertEquals("window_wall_ratio", objectTest.GetProperties().elementAt(8).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(8).GetUnit());

        assertEquals("number_of_doors ", objectTest.GetProperties().elementAt(9).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(9).GetUnit());

        assertEquals("exterior_wall_fraction", objectTest.GetProperties().elementAt(10).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(10).GetUnit());

        assertEquals("interior_exterior_wall_ratio", objectTest.GetProperties().elementAt(11).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(11).GetUnit());

        assertEquals("exterior_ceiling_fraction", objectTest.GetProperties().elementAt(12).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(12).GetUnit());

        assertEquals("exterior_floor_fraction ", objectTest.GetProperties().elementAt(13).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(13).GetUnit());

        assertEquals("window_shading", objectTest.GetProperties().elementAt(14).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(14).GetUnit());

        assertEquals("window_exterior_transmission_coefficient", objectTest.GetProperties().elementAt(15).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(15).GetUnit());

        assertEquals("solar_heatgain_factor ", objectTest.GetProperties().elementAt(16).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(16).GetUnit());

        assertEquals("airchange_per_hour ", objectTest.GetProperties().elementAt(17).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(17).GetUnit());

        assertEquals("airchange_UA ", objectTest.GetProperties().elementAt(18).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(18).GetValue());
        assertEquals("Btu/degF.h", objectTest.GetProperties().elementAt(18).GetUnit());

        assertEquals("UA", objectTest.GetProperties().elementAt(19).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(19).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(19).GetUnit());

        assertEquals("internal_gain ", objectTest.GetProperties().elementAt(20).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(20).GetValue());
        assertEquals("Btu/h", objectTest.GetProperties().elementAt(20).GetUnit());

        assertEquals("solar_gain ", objectTest.GetProperties().elementAt(21).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(21).GetValue());
        assertEquals("Btu/h", objectTest.GetProperties().elementAt(21).GetUnit());

        assertEquals("incident_solar_radiation ", objectTest.GetProperties().elementAt(22).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(22).GetValue());
        assertEquals("Btu/h.sf", objectTest.GetProperties().elementAt(22).GetUnit());

        assertEquals("heat_cool_gain ", objectTest.GetProperties().elementAt(23).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(23).GetValue());
        assertEquals("Btu/h", objectTest.GetProperties().elementAt(23).GetUnit());

        assertEquals("include_solar_quadrant", objectTest.GetProperties().elementAt(24).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(24).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(24).GetUnit());

        assertEquals("heating_cop_curve", objectTest.GetProperties().elementAt(25).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(25).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(25).GetUnit());

        assertEquals("thermostat_deadband ", objectTest.GetProperties().elementAt(26).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(26).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(26).GetUnit());

        assertEquals("int16 thermostat_cycle_time ", objectTest.GetProperties().elementAt(27).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(27).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(27).GetUnit());

        assertEquals("thermostat_last_cycle_time ", objectTest.GetProperties().elementAt(28).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(28).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(28).GetUnit());

        assertEquals("heating_point ", objectTest.GetProperties().elementAt(29).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(29).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(29).GetUnit());

        assertEquals("cooling_point ", objectTest.GetProperties().elementAt(30).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(30).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(30).GetUnit());

        assertEquals("design_heating_point ", objectTest.GetProperties().elementAt(31).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(31).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(31).GetUnit());

        assertEquals("design_cooling_point ", objectTest.GetProperties().elementAt(32).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(32).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(32).GetUnit());

        assertEquals("over_sizing_factor ", objectTest.GetProperties().elementAt(33).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(33).GetValue());
        assertEquals("unit", objectTest.GetProperties().elementAt(33).GetUnit());

        assertEquals("design_heating_capacity ", objectTest.GetProperties().elementAt(34).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(34).GetValue());
        assertEquals("Btu/h", objectTest.GetProperties().elementAt(34).GetUnit());

        assertEquals("design_cooling_capacity ", objectTest.GetProperties().elementAt(35).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(35).GetValue());
        assertEquals("Btu/h", objectTest.GetProperties().elementAt(35).GetUnit());

        assertEquals("cooling_design_temperature ", objectTest.GetProperties().elementAt(36).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(36).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(36).GetUnit());

        assertEquals("heating_design_temperature ", objectTest.GetProperties().elementAt(37).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(37).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(37).GetUnit());

        assertEquals("design_peak_solar ", objectTest.GetProperties().elementAt(38).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(38).GetValue());
        assertEquals("Btu/h", objectTest.GetProperties().elementAt(38).GetUnit());

        assertEquals("design_internal_gains ", objectTest.GetProperties().elementAt(39).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(39).GetValue());
        assertEquals("W/sf", objectTest.GetProperties().elementAt(39).GetUnit());

        assertEquals("air_heat_fraction ", objectTest.GetProperties().elementAt(40).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(40).GetValue());
        assertEquals("pu", objectTest.GetProperties().elementAt(40).GetUnit());

        assertEquals("mass_solar_gain_fraction ", objectTest.GetProperties().elementAt(41).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(41).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(41).GetUnit());

        assertEquals("mass_internal_gain_fraction ", objectTest.GetProperties().elementAt(42).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(42).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(42).GetUnit());

        assertEquals("auxiliary_heat_capacity ", objectTest.GetProperties().elementAt(43).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(43).GetValue());
        assertEquals("Btu/h", objectTest.GetProperties().elementAt(43).GetUnit());

        assertEquals("aux_heat_deadband ", objectTest.GetProperties().elementAt(44).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(44).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(44).GetUnit());

        assertEquals("aux_heat_temperature_lockout ", objectTest.GetProperties().elementAt(45).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(45).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(45).GetUnit());

        assertEquals("aux_heat_time_delay ", objectTest.GetProperties().elementAt(46).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(46).GetValue());
        assertEquals("s", objectTest.GetProperties().elementAt(46).GetUnit());

        assertEquals("cooling_supply_air_temp ", objectTest.GetProperties().elementAt(47).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(47).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(47).GetUnit());

        assertEquals("heating_supply_air_temp ", objectTest.GetProperties().elementAt(48).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(48).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(48).GetUnit());

        assertEquals("duct_pressure_drop ", objectTest.GetProperties().elementAt(49).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(49).GetValue());
        assertEquals("in", objectTest.GetProperties().elementAt(49).GetUnit());

        assertEquals("fan_design_power ", objectTest.GetProperties().elementAt(50).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(50).GetValue());
        assertEquals("W", objectTest.GetProperties().elementAt(50).GetUnit());

        assertEquals("fan_low_power_fraction ", objectTest.GetProperties().elementAt(51).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(51).GetValue());
        assertEquals("pu", objectTest.GetProperties().elementAt(51).GetUnit());

        assertEquals("fan_power ", objectTest.GetProperties().elementAt(52).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(52).GetValue());
        assertEquals("kW", objectTest.GetProperties().elementAt(52).GetUnit());

        assertEquals("fan_design_airflow ", objectTest.GetProperties().elementAt(53).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(53).GetValue());
        assertEquals("cfm", objectTest.GetProperties().elementAt(53).GetUnit());

        assertEquals("fan_impedance_fraction ", objectTest.GetProperties().elementAt(54).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(54).GetValue());
        assertEquals("pu", objectTest.GetProperties().elementAt(54).GetUnit());

        assertEquals("fan_power_fraction ", objectTest.GetProperties().elementAt(55).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(55).GetValue());
        assertEquals("pu", objectTest.GetProperties().elementAt(55).GetUnit());

        assertEquals("fan_current_fraction ", objectTest.GetProperties().elementAt(56).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(56).GetValue());
        assertEquals("pu", objectTest.GetProperties().elementAt(56).GetUnit());

        assertEquals("fan_power_factor ", objectTest.GetProperties().elementAt(57).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(57).GetValue());
        assertEquals("pu", objectTest.GetProperties().elementAt(57).GetUnit());

        assertEquals("heating_demand ", objectTest.GetProperties().elementAt(58).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(58).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(58).GetUnit());

        assertEquals("cooling_demand ", objectTest.GetProperties().elementAt(59).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(59).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(59).GetUnit());

        assertEquals("heating_COP ", objectTest.GetProperties().elementAt(60).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(60).GetValue());
        assertEquals("pu", objectTest.GetProperties().elementAt(60).GetUnit());

        assertEquals("cooling_COP ", objectTest.GetProperties().elementAt(61).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(61).GetValue());
        assertEquals("Btu/kWh", objectTest.GetProperties().elementAt(61).GetUnit());

        assertEquals("air_temperature ", objectTest.GetProperties().elementAt(62).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(62).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(62).GetUnit());

        assertEquals("outdoor_temperature ", objectTest.GetProperties().elementAt(63).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(63).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(63).GetUnit());

        assertEquals("outdoor_rh ", objectTest.GetProperties().elementAt(64).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(64).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(64).GetUnit());

        assertEquals("mass_heat_capacity ", objectTest.GetProperties().elementAt(65).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(65).GetValue());
        assertEquals("Btu/degF", objectTest.GetProperties().elementAt(65).GetUnit());

        assertEquals("mass_heat_coeff ", objectTest.GetProperties().elementAt(66).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(66).GetValue());
        assertEquals("Btu/degF.h", objectTest.GetProperties().elementAt(66).GetUnit());

        assertEquals("mass_temperature ", objectTest.GetProperties().elementAt(67).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(67).GetValue());
        assertEquals("degF", objectTest.GetProperties().elementAt(67).GetUnit());

        assertEquals("air_volume ", objectTest.GetProperties().elementAt(68).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(68).GetValue());
        assertEquals("cf", objectTest.GetProperties().elementAt(68).GetUnit());

        assertEquals("air_mass ", objectTest.GetProperties().elementAt(69).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(69).GetValue());
        assertEquals("lb", objectTest.GetProperties().elementAt(69).GetUnit());

        assertEquals("air_heat_capacity ", objectTest.GetProperties().elementAt(70).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(70).GetValue());
        assertEquals("Btu/degF", objectTest.GetProperties().elementAt(70).GetUnit());

        assertEquals("latent_load_fraction ", objectTest.GetProperties().elementAt(71).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(71).GetValue());
        assertEquals("pu", objectTest.GetProperties().elementAt(71).GetUnit());

        assertEquals("total_thermal_mass_per_floor_area", objectTest.GetProperties().elementAt(72).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(72).GetValue());
        assertEquals("Btu/degF.sf", objectTest.GetProperties().elementAt(72).GetUnit());

        assertEquals("interior_surface_heat_transfer_coeff", objectTest.GetProperties().elementAt(73).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(73).GetValue());
        assertEquals("Btu/h.degF.sf", objectTest.GetProperties().elementAt(73).GetUnit());

        assertEquals("number_of_stories ", objectTest.GetProperties().elementAt(74).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(74).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(74).GetUnit());

        assertEquals("is_AUX_on ", objectTest.GetProperties().elementAt(75).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(75).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(75).GetUnit());

        assertEquals("is_HEAT_on ", objectTest.GetProperties().elementAt(76).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(76).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(76).GetUnit());

        assertEquals("is_COOL_on ", objectTest.GetProperties().elementAt(77).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(77).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(77).GetUnit());

        assertEquals("thermal_storage_present ", objectTest.GetProperties().elementAt(78).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(78).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(78).GetUnit());

        assertEquals("thermal_storage_in_use ", objectTest.GetProperties().elementAt(79).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(79).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(79).GetUnit());

        assertEquals("system_type ", objectTest.GetProperties().elementAt(80).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(80).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(80).GetUnit());

        assertEquals("auxiliary_strategy ", objectTest.GetProperties().elementAt(81).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(81).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(81).GetUnit());

        assertEquals("system_mode ", objectTest.GetProperties().elementAt(82).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(82).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(82).GetUnit());

        assertEquals("last_system_mode ", objectTest.GetProperties().elementAt(83).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(83).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(83).GetUnit());

        assertEquals("heating_system_type", objectTest.GetProperties().elementAt(84).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(84).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(84).GetUnit());

        assertEquals("cooling_system_type", objectTest.GetProperties().elementAt(85).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(85).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(85).GetUnit());

        assertEquals("auxiliary_system_type", objectTest.GetProperties().elementAt(86).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(86).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(86).GetUnit());

        assertEquals("fan_type", objectTest.GetProperties().elementAt(87).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(87).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(87).GetUnit());

        assertEquals("thermal_integrity_level ", objectTest.GetProperties().elementAt(88).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(88).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(88).GetUnit());

        assertEquals("glass_type ", objectTest.GetProperties().elementAt(89).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(89).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(89).GetUnit());

        assertEquals("window_frame ", objectTest.GetProperties().elementAt(90).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(90).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(90).GetUnit());

        assertEquals("glazing_treatment ", objectTest.GetProperties().elementAt(91).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(91).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(91).GetUnit());

        assertEquals("glazing_layers ", objectTest.GetProperties().elementAt(92).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(92).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(92).GetUnit());

        assertEquals("motor_model ", objectTest.GetProperties().elementAt(93).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(93).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(93).GetUnit());

        assertEquals("motor_efficiency ", objectTest.GetProperties().elementAt(94).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(94).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(94).GetUnit());

        assertEquals("last_mode_timer", objectTest.GetProperties().elementAt(95).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(95).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(95).GetUnit());

        assertEquals("hvac_motor_efficiency ", objectTest.GetProperties().elementAt(96).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(96).GetValue());
        assertEquals("unit", objectTest.GetProperties().elementAt(96).GetUnit());

        assertEquals("hvac_motor_loss_power_factor ", objectTest.GetProperties().elementAt(97).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(97).GetValue());
        assertEquals("unit", objectTest.GetProperties().elementAt(97).GetUnit());

        assertEquals("Rroof ", objectTest.GetProperties().elementAt(98).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(98).GetValue());
        assertEquals("degF.sf.h/Btu", objectTest.GetProperties().elementAt(98).GetUnit());

        assertEquals("Rwall ", objectTest.GetProperties().elementAt(99).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(99).GetValue());
        assertEquals("degF.sf.h/Btu", objectTest.GetProperties().elementAt(99).GetUnit());

        assertEquals("Rfloor ", objectTest.GetProperties().elementAt(100).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(100).GetValue());
        assertEquals("degF.sf.h/Btu", objectTest.GetProperties().elementAt(100).GetUnit());

        assertEquals("Rwindows ", objectTest.GetProperties().elementAt(101).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(101).GetValue());
        assertEquals("degF.sf.h/Btu", objectTest.GetProperties().elementAt(101).GetUnit());

        assertEquals("Rdoors ", objectTest.GetProperties().elementAt(102).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(102).GetValue());
        assertEquals("degF.sf.h/Btu", objectTest.GetProperties().elementAt(102).GetUnit());

        assertEquals("hvac_breaker_rating ", objectTest.GetProperties().elementAt(103).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(103).GetValue());
        assertEquals("A", objectTest.GetProperties().elementAt(103).GetUnit());

        assertEquals("hvac_power_factor ", objectTest.GetProperties().elementAt(104).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(104).GetValue());
        assertEquals("unit", objectTest.GetProperties().elementAt(104).GetUnit());

        assertEquals("hvac_load ", objectTest.GetProperties().elementAt(105).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(105).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(105).GetUnit());

        assertEquals("last_heating_load ", objectTest.GetProperties().elementAt(106).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(106).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(106).GetUnit());

        assertEquals("last_cooling_load ", objectTest.GetProperties().elementAt(107).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(107).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(107).GetUnit());

        assertEquals("hvac_power ", objectTest.GetProperties().elementAt(108).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(108).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(108).GetUnit());

        assertEquals("total_load ", objectTest.GetProperties().elementAt(109).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(109).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(109).GetUnit());

        assertEquals("panel ", objectTest.GetProperties().elementAt(110).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(110).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(110).GetUnit());

        assertEquals("design_internal_gain_density ", objectTest.GetProperties().elementAt(111).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(111).GetValue());
        assertEquals("W/sf", objectTest.GetProperties().elementAt(111).GetUnit());

        assertEquals("compressor_on", objectTest.GetProperties().elementAt(112).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(112).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(112).GetUnit());

        assertEquals("compressor_count", objectTest.GetProperties().elementAt(113).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(113).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(113).GetUnit());

        assertEquals("hvac_last_on", objectTest.GetProperties().elementAt(114).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(114).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(114).GetUnit());

        assertEquals("hvac_last_off", objectTest.GetProperties().elementAt(115).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(115).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(115).GetUnit());

        assertEquals("hvac_period_length", objectTest.GetProperties().elementAt(116).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(116).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(116).GetUnit());

        assertEquals("hvac_duty_cycle", objectTest.GetProperties().elementAt(117).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(117).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(117).GetUnit());

        assertEquals("thermostat_control ", objectTest.GetProperties().elementAt(118).GetName());
        assertEquals("", objectTest.GetProperties().elementAt(118).GetValue());
        assertEquals("", objectTest.GetProperties().elementAt(118).GetUnit());
    }

    @Test
    public void testToGLM(){
        assertEquals("object house{ \n"+
                        "} \n",
                objectTest.ToGLM());

    }
    @Test
    public void testSetProperty(){
        createPs();
        objectTest.SetProperty(ps);
        assertEquals(ps,objectTest.GetProperties());
    }

    @Test
    public void testGetModule(){assertEquals(2,objectTest.getModule());}

    public void main(){
        House h=new House();
        for(int i=0;i<h.GetProperties().size();i++){
            System.out.println(" assertEquals("+h.GetProperties().elementAt(i).GetName()+", objectTest.GetProperties().elementAt("+i+").GetName());\n" +
                    "        assertEquals("+h.GetProperties().elementAt(i).GetValue()+", objectTest.GetProperties().elementAt(\"+i+\").GetValue());\n" +
                    "        assertEquals("+h.GetProperties().elementAt(i).GetUnit()+", objectTest.GetProperties().elementAt(\"+i+\").GetUnit());");
        }
    }
}
