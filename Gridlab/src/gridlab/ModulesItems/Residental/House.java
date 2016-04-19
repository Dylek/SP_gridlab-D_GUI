package gridlab.ModulesItems.Residental;

import gridlab.ModulesItems.Property;
import gridlab.ModulesItems.ToGLMParser;

import java.util.Vector;

/**
 * Created by Dylek on 2016-04-16.
 */
public class House implements ToGLMParser {
    private Vector<Property> properties;
    private int module = 2;

    public House(){
        properties = new Vector<Property>();

        properties.add (new Property( "name", "",""));
        properties.add(new Property("parent", "", ""));
        properties.add (new Property( "weather ", "",""));
        properties.add (new Property( "floor_area", "","sf"));
        properties.add (new Property( "gross_wall_area ", "","sf"));
        properties.add (new Property( "ceiling_height", "","ft"));
        properties.add (new Property( "aspect_ratio", "",""));
        properties.add (new Property( "envelope_UA", "","Btu/degF.h"));
        properties.add (new Property( "window_wall_ratio", "",""));
        properties.add (new Property( "number_of_doors ", "",""));
        properties.add (new Property( "exterior_wall_fraction", "",""));
        properties.add (new Property( "interior_exterior_wall_ratio", "",""));
        properties.add (new Property( "exterior_ceiling_fraction", "",""));
        properties.add (new Property( "exterior_floor_fraction ", "",""));
        properties.add (new Property( "window_shading", "",""));
        properties.add (new Property( "window_exterior_transmission_coefficient", "",""));
        properties.add (new Property( "solar_heatgain_factor ", "",""));
        properties.add (new Property( "airchange_per_hour ", "",""));
        properties.add (new Property( "airchange_UA ", "","Btu/degF.h"));
        properties.add (new Property( "UA", "",""));
        properties.add (new Property( "internal_gain ", "","Btu/h"));
        properties.add (new Property( "solar_gain ", "","Btu/h"));
        properties.add (new Property( "incident_solar_radiation ", "","Btu/h.sf"));
        properties.add (new Property( "heat_cool_gain ", "","Btu/h"));
        properties.add (new Property( "include_solar_quadrant", "",""));
        properties.add (new Property( "heating_cop_curve", "",""));
        properties.add (new Property( "thermostat_deadband ", "","degF"));
        properties.add (new Property( "int16 thermostat_cycle_time ", "",""));
        properties.add (new Property( "thermostat_last_cycle_time ", "",""));
        properties.add (new Property( "heating_point ", "",""));
        properties.add (new Property( "cooling_point ", "",""));
        properties.add (new Property( "design_heating_point ", "",""));
        properties.add (new Property( "design_cooling_point ", "",""));
        properties.add (new Property( "over_sizing_factor ", "","unit"));
        properties.add (new Property( "design_heating_capacity ", "","Btu/h"));
        properties.add (new Property( "design_cooling_capacity ", "","Btu/h"));
        properties.add (new Property( "cooling_design_temperature ", "","degF"));
        properties.add (new Property( "heating_design_temperature ", "","degF"));
        properties.add (new Property( "design_peak_solar ", "","Btu/h"));
        properties.add (new Property( "design_internal_gains ", "","W/sf"));
        properties.add (new Property( "air_heat_fraction ", "","pu"));
        properties.add (new Property( "mass_solar_gain_fraction ", "",""));
        properties.add (new Property( "mass_internal_gain_fraction ", "",""));
        properties.add (new Property( "auxiliary_heat_capacity ", "","Btu/h"));
        properties.add (new Property( "aux_heat_deadband ", "","degF"));
        properties.add (new Property( "aux_heat_temperature_lockout ", "","degF"));
        properties.add (new Property( "aux_heat_time_delay ", "","s"));
        properties.add (new Property( "cooling_supply_air_temp ", "","degF"));
        properties.add (new Property( "heating_supply_air_temp ", "","degF"));
        properties.add (new Property( "duct_pressure_drop ", "","in"));
        properties.add (new Property( "fan_design_power ", "","W"));
        properties.add (new Property( "fan_low_power_fraction ", "","pu"));
        properties.add (new Property( "fan_power ", "","kW"));
        properties.add (new Property( "fan_design_airflow ", "","cfm"));
        properties.add (new Property( "fan_impedance_fraction ", "","pu"));
        properties.add (new Property( "fan_power_fraction ", "","pu"));
        properties.add (new Property( "fan_current_fraction ", "","pu"));
        properties.add (new Property( "fan_power_factor ", "","pu"));
        properties.add (new Property( "heating_demand ", "",""));
        properties.add (new Property( "cooling_demand ", "",""));
        properties.add (new Property( "heating_COP ", "","pu"));
        properties.add (new Property( "cooling_COP ", "","Btu/kWh"));
        properties.add (new Property( "air_temperature ", "","degF"));
        properties.add (new Property( "outdoor_temperature ", "","degF"));
        properties.add (new Property( "outdoor_rh ", "",""));
        properties.add (new Property( "mass_heat_capacity ", "","Btu/degF"));
        properties.add (new Property( "mass_heat_coeff ", "","Btu/degF.h"));
        properties.add (new Property( "mass_temperature ", "","degF"));
        properties.add (new Property( "air_volume ", "","cf"));
        properties.add (new Property( "air_mass ", "","lb"));
        properties.add (new Property( "air_heat_capacity ", "","Btu/degF"));
        properties.add (new Property( "latent_load_fraction ", "","pu"));
        properties.add (new Property( "total_thermal_mass_per_floor_area", "","Btu/degF.sf"));
        properties.add (new Property( "interior_surface_heat_transfer_coeff", "","Btu/h.degF.sf"));
        properties.add (new Property( "number_of_stories ", "",""));
        properties.add (new Property( "is_AUX_on ", "",""));
        properties.add (new Property( "is_HEAT_on ", "",""));
        properties.add (new Property( "is_COOL_on ", "",""));
        properties.add (new Property( "thermal_storage_present ", "",""));
        properties.add (new Property( "thermal_storage_in_use ", "",""));
        properties.add (new Property( "system_type ", "",""));
        properties.add (new Property( "auxiliary_strategy ", "",""));
        properties.add (new Property( "system_mode ", "",""));
        properties.add (new Property( "last_system_mode ", "",""));
        properties.add (new Property( "heating_system_type", "",""));
        properties.add (new Property( "cooling_system_type", "",""));
        properties.add (new Property( "auxiliary_system_type", "",""));
        properties.add (new Property( "fan_type", "",""));
        properties.add (new Property( "thermal_integrity_level ", "",""));
        properties.add (new Property( "glass_type ", "",""));
        properties.add (new Property( "window_frame ", "",""));
        properties.add (new Property( "glazing_treatment ", "",""));
        properties.add (new Property( "glazing_layers ", "",""));
        properties.add (new Property( "motor_model ", "",""));
        properties.add (new Property( "motor_efficiency ", "",""));
        properties.add (new Property( "last_mode_timer", "",""));
        properties.add (new Property( "hvac_motor_efficiency ", "","unit"));
        properties.add (new Property( "hvac_motor_loss_power_factor ", "","unit"));
        properties.add (new Property( "Rroof ", "","degF.sf.h/Btu"));
        properties.add (new Property( "Rwall ", "","degF.sf.h/Btu"));
        properties.add (new Property( "Rfloor ", "","degF.sf.h/Btu"));
        properties.add (new Property( "Rwindows ", "","degF.sf.h/Btu"));
        properties.add (new Property( "Rdoors ", "","degF.sf.h/Btu"));
        properties.add (new Property( "hvac_breaker_rating ", "","A"));
        properties.add (new Property( "hvac_power_factor ", "","unit"));
        properties.add (new Property( "hvac_load ", "",""));
        properties.add (new Property( "last_heating_load ", "",""));
        properties.add (new Property( "last_cooling_load ", "",""));
        properties.add (new Property( "hvac_power ", "",""));
        properties.add (new Property( "total_load ", "",""));
        properties.add (new Property( "panel ", "",""));
        properties.add (new Property( "design_internal_gain_density ", "","W/sf"));
        properties.add (new Property( "compressor_on", "",""));
        properties.add (new Property( "compressor_count", "",""));
        properties.add (new Property( "hvac_last_on", "",""));
        properties.add (new Property( "hvac_last_off", "",""));
        properties.add (new Property( "hvac_period_length", "",""));
        properties.add (new Property( "hvac_duty_cycle", "",""));
        properties.add(new Property("thermostat_control ", "", ""));
    }

    public House(House house){
        properties=house.GetProperties();
    }
    public void SetProperty(Vector<Property> wektor){
        properties=wektor;
    }
    public Vector<Property> GetProperties(){
        return properties;
    }
    public String ToGLM(){
        String s="";
        s="object house{ \n";
        for (Property p: properties){
            if(p.GetValue()!=null)
            {
                s+=p.GetName()+"    "+p.GetValue();
                // if(false)s+=" "+p.GetUnit();
                s+=";\n";
            }
        }
        s+="} \n";
        return s;
    }

    public int getModule(){
        return module;
    }
}
