//
// Tomás Oliveira e Silva, AED, November 2021
//
// Generic queue (First In First Out) implementation based on an linked list
//

#ifndef _AED_lQueue_
#define _AED_lQueue_

#include <cassert>

template <typename T>
class lQueue
{
  private:
  sList<T> L;

  public:
    lQueue(void)
    {
      sList(L);
    }
    ~lQueue(void)
    {
      ~sList(void)
    }
    void clear(void)
    {

    }
    int size(void) const
    {
      size(void)
    }
    int is_full(void) const
    {
    }
    int is_empty(void) const
    {

    }
    void enqueue(T &v)
    {
    }
    T dequeue(void)
    {
    }
    T peek(void)
    {
    }
};

#endif
