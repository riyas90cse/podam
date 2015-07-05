package uk.co.jemos.podam.typeManufacturers;

import uk.co.jemos.podam.api.AttributeMetadata;
import uk.co.jemos.podam.api.DataProviderStrategy;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 * Wraps parameters for the Message Channel
 * Created by tedonema on 28/06/2015.
 */
public class TypeManufacturerParamsWrapperForGenericTypes extends TypeManufacturerParamsWrapper {


    /** The Map of type arguments */
    private final Map<String, Type> typeArgumentsMap;

    /** The attribute generic type */
    private final Type attributeGenericType;

    /**
     * Full constructor.
     *
     * @param dataProviderStrategy The DataProviderStrategy
     * @param attributeMetadata    The AttributeMetadata
     * @param typeArgumentsMap The map of type arguments
     */
    public TypeManufacturerParamsWrapperForGenericTypes(DataProviderStrategy dataProviderStrategy,
                                                        AttributeMetadata attributeMetadata,
                                                        Map<String, Type> typeArgumentsMap,
                                                        Type attributeGenericType) {
        super(dataProviderStrategy, attributeMetadata);

        //safe copy
        this.typeArgumentsMap = new HashMap<String, Type>(typeArgumentsMap);
        this.attributeGenericType = attributeGenericType;
    }

    /**
     * Returns the type arguments map.
     * @return The type arguments map
     */
    public Map<String, Type> getTypeArgumentsMap() {
        return new HashMap<String, Type>(typeArgumentsMap);
    }

    /**
     * Returns the attribute generic type.
     * @return The attribute generic type
     */
    public Type getAttributeGenericType() {
        return attributeGenericType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TypeManufacturerParamsWrapperForGenericTypes{");
        sb.append("typeArgumentsMap=").append(typeArgumentsMap);
        sb.append(", attributeGenericType=").append(attributeGenericType);
        sb.append('}');
        return sb.toString();
    }
}
