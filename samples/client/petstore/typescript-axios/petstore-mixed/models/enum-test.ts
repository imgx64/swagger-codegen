/* tslint:disable */
/* eslint-disable */
/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
/**
 * 
 * @export
 * @interface EnumTest
 */
export interface EnumTest {
    /**
     * 
     * @type {string}
     * @memberof EnumTest
     */
    enumString?: EnumTestEnumStringEnum;
    /**
     * 
     * @type {number}
     * @memberof EnumTest
     */
    enumInteger?: EnumTestEnumIntegerEnum;
    /**
     * 
     * @type {number}
     * @memberof EnumTest
     */
    enumNumber?: EnumTestEnumNumberEnum;
    /**
     * 
     * @type {OuterEnum}
     * @memberof EnumTest
     */
    outerEnum?: any;
}

/**
    * @export
    * @enum {string}
    */
export enum EnumTestEnumStringEnum {
    UPPER = 'UPPER',
    Lower = 'lower',
    Empty = ''
}
/**
    * @export
    * @enum {string}
    */
export enum EnumTestEnumIntegerEnum {
    NUMBER_1 = 1,
    NUMBER_MINUS_1 = -1
}
/**
    * @export
    * @enum {string}
    */
export enum EnumTestEnumNumberEnum {
    NUMBER_1_DOT_1 = 1.1,
    NUMBER_MINUS_1_DOT_2 = -1.2
}

