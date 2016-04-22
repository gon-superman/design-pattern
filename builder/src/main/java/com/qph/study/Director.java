package com.qph.study;

import com.qph.study.builder.Builder;

public class Director {

	private Builder builder;  
	  
    public Director(Builder builder) {  
        this.builder = builder;  
    }  
      
    public void construct(String head,String body,String foot){  
        //通过使用生成器接口来构建最终的产品对象  
        builder.buildHead(head);
        builder.buildBody(body);
        builder.buildFoot(foot);
    }  
}
