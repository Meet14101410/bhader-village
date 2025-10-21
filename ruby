# Define the data for Bhader village using a Hash
bhader_village = {
    name: "Bhader",
    state: "Gujarat",
    district: "Amreli",
    taluka: "Dhari",
    population: 3924,
    pincode: "365645",
    area_hectares: 2633.69
}

puts "=== 🇮🇳 Bhader Village Data (Amreli) ==="

# Iterate through the hash to print the details
bhader_village.each do |key, value|
    # Format the output nicely
    formatted_key = key.to_s.gsub('_', ' ').capitalize
    puts "#{formatted_key.ljust(25)}: #{value}"
end

puts "======================================="
