#include <iostream>
#include <string>

// Define a structure to hold the village data
struct Village {
    std::string name;
    std::string district;
    std::string taluka;
    int population;
    std::string pincode;
    double area_hectares;
};

int main() {
    // Instantiate the Village structure with Bhader (Amreli) data
    Village bhader_amreli = {
        "Bhader",
        "Amreli",
        "Dhari",
        3924,
        "365645",
        2633.69
    };

    std::cout << "=== 🇮🇳 Bhader Village Data (Amreli) ===" << std::endl;
    std::cout << "Village Name: " << bhader_amreli.name << std::endl;
    std::cout << "District: " << bhader_amreli.district << std::endl;
    std::cout << "Taluka: " << bhader_amreli.taluka << std::endl;
    std::cout << "Population (2011 Census): " << bhader_amreli.population << std::endl;
    std::cout << "Pincode: " << bhader_amreli.pincode << std::endl;
    std::cout << "Area (Hectares): " << bhader_amreli.area_hectares << std::endl;
    std::cout << "=======================================" << std::endl;

    return 0;
}
