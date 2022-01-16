package com.xingyun.springbootwithspringbatchsample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/***
 * Business Data
 * @author qingfeng.zhao
 * @date 2022/1/16
 * @apiNote
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person implements Serializable {
    private String lastName;
    private String firstName;
}
