#import "OwlNativeModule.h"


@implementation OwlNativeModule

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(sqrNumber:(NSInteger)number callback:(RCTResponseSenderBlock)callback)
{
  NSInteger *sqr = number * number;
  NSString *res = [[NSString alloc] initWithFormat:@"%d", sqr];
  callback(@[[NSNull null], res]);
}

@end
