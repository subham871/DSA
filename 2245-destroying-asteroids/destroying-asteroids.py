class Solution:
    def asteroidsDestroyed(self, mass: int, asteroids: List[int]) -> bool:
        currentMass=mass
        asteroids.sort()
        i=0
        while(i<len(asteroids)):
            if asteroids[i]>currentMass:
                return False
            currentMass+=asteroids[i]
            i+=1
        return True

        