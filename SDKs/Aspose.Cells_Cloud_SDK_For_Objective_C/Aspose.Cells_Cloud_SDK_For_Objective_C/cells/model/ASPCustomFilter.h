#import <Foundation/Foundation.h>
#import "ASPObject.h"

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

#import "ASPSystemObject.h"


@protocol ASPCustomFilter
@end

@interface ASPCustomFilter : ASPObject


@property(nonatomic) ASPSystemObject* criteria;

@property(nonatomic) NSString* filterOperatorType;

@end
