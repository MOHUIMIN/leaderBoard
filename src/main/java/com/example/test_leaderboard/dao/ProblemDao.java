package com.example.test_leaderboard.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.test_leaderboard.entity.Problem;

@Mapper
public interface ProblemDao {
    Problem selectProblem(Integer problemNumber);
}