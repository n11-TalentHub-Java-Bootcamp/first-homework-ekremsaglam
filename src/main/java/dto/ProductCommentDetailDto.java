package dto;

import java.math.BigDecimal;

public class ProductCommentDetailDto {
    private ProductDetailDto productDetailDto;
    private UserInfoDetailDto userInfoDetailDto;
    private CommentDetailDto commentDetailDto;

    public ProductCommentDetailDto() {
    }

    public ProductCommentDetailDto(ProductDetailDto productDetailDto, UserInfoDetailDto userInfoDetailDto, CommentDetailDto commentDetailDto) {
        this.productDetailDto = productDetailDto;
        this.userInfoDetailDto = userInfoDetailDto;
        this.commentDetailDto = commentDetailDto;
    }

    public ProductDetailDto getProductDetailDto() {
        return productDetailDto;
    }

    public void setProductDetailDto(ProductDetailDto productDetailDto) {
        this.productDetailDto = productDetailDto;
    }

    public UserInfoDetailDto getUserInfoDetailDto() {
        return userInfoDetailDto;
    }

    public void setUserInfoDetailDto(UserInfoDetailDto userInfoDetailDto) {
        this.userInfoDetailDto = userInfoDetailDto;
    }

    public CommentDetailDto getCommentDetailDto() {
        return commentDetailDto;
    }

    public void setCommentDetailDto(CommentDetailDto commentDetailDto) {
        this.commentDetailDto = commentDetailDto;
    }

    @Override
    public String toString() {
        return "ProductCommentDetailDto{" +
                "productDetailDto=" + productDetailDto.toString() +
                ", userInfoDetailDto=" + userInfoDetailDto.toString() +
                ", commentDetailDto=" + commentDetailDto.toString() +
                '}';
    }
}
